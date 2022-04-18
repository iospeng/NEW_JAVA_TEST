package main.java.employee.MovieBuy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {
    // 定义集合存放用户信息（用户、商家）
    private static final List<User> ALL_USERS = new ArrayList<>();
    /*
        定义Map集合嵌套list集合存放商家、电影信息
        商家作为Key
        list中存放电影的信息，作为value
     */
    private static final Map<Business,List<Movie>> ALL_MOVIES = new HashMap<>();
    private static final Scanner ALL_sca = new Scanner(System.in);
    //定义静态变量存放登陆成功的用户
    public static User loginUser;
    //静态日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
    // 定义list集合用于存储添加的Movie对象
    public static List<Movie> movies1 = new ArrayList<>();
    public static List<Movie> movies2 = new ArrayList<>();
    /*
        提前准备测试数据
     */
    static {
        Customer cus1 = new Customer();
        cus1.setLoginName("zhangsan");
        cus1.setPassWord("123456");
        cus1.setName("张三");
        cus1.setGender("男");
        cus1.setPhone("15671278890");
        cus1.setMoney(900);
        ALL_USERS.add(cus1);

        Customer cus2 = new Customer();
        cus2.setLoginName("lisi");
        cus2.setPassWord("123456");
        cus2.setName("李四");
        cus2.setGender("女");
        cus2.setPhone("12345678901");
        cus2.setMoney(700);
        ALL_USERS.add(cus2);

        Business bus1 = new Business();
        bus1.setLoginName("shangjia1");
        bus1.setPassWord("123456");
        bus1.setName("商家1");
        bus1.setGender("男");
        bus1.setPhone("1111111111");
        bus1.setMoney(1950);
        bus1.setShopName("商家1的店铺");
        bus1.setAddress("郁金香岸");
        ALL_USERS.add(bus1);
        // 商家信息还需要放到map集合中去
        // 先定义一个空的list集合，后面用于存放电影信息
//        List<Movie> movies1 = new ArrayList<>();
        ALL_MOVIES.put(bus1,movies1);

        Business bus2 = new Business();
        bus2.setLoginName("shangjia2");
        bus2.setPassWord("123456");
        bus2.setName("商家2");
        bus2.setGender("女");
        bus2.setPhone("120120");
        bus2.setMoney(3950);
        bus2.setShopName("商家2的店铺");
        bus2.setAddress("戈雅公寓");
        ALL_USERS.add(bus2);
        // 商家信息还需要放到map集合中去
        // 先定义一个空的list集合，后面用于存放电影信息
//        List<Movie> movies2 = new ArrayList<>();
        ALL_MOVIES.put(bus2,movies2);

    }
    public static void main(String[] args) {
       showMain();
    }
    // 首页
    private static void showMain() {
        System.out.println("=========电影系统主页==========");
        while (true){
            System.out.println("请选择您要操作的功能：");
            System.out.println("1、登陆（商家、客户）：");
            System.out.println("2、商家入驻：");
            System.out.println("3、客户注册：");
            String command = ALL_sca.nextLine();
            switch (command){
                case "1":
                    login();
                    break;
                case "2":
                    System.out.println("商家入驻");
                    break;
                case "3":
                    System.out.println("客户注册");
                    break;
                default:
                    System.out.println("请选择正确的操作！！");
                    LOGGER.trace("未登录，选择操作错误！");
                    break;
            }
        }
    }
    //登陆
    private static void login() {
        while (true) {
            System.out.println("请输入登录名：");
            String loginName = ALL_sca.nextLine();
            System.out.println("请输入密码：");
            String passWord = ALL_sca.nextLine();
            User user = getUserByLoginName(loginName);
            if (user != null){
                if (passWord.equals(user.getPassWord())){
                    //登陆成功
                    loginUser = user;
                    // 判断是商家登陆还是用户登陆
                    if (user instanceof Customer){
                        LOGGER.trace("用户：" + loginUser.getLoginName() + "登陆成功！");
                        showCustomerMain();
                    }else {
                        LOGGER.trace("商家：" + loginUser.getLoginName() + "登陆成功！");
                        showBusinessMain();
                    }
                    return;
                }else {
                    System.out.println("密码错误，请重新输入！");
                    LOGGER.trace("密码输入错误！");
                }
            }else {
                System.out.println("登录名输入有误，请重新输入！");
                LOGGER.trace("登录名输入错误！");
            }
        }


    }

    private static void showBusinessMain() {
        while (true) {
            System.out.println("==========影院商家界面==========");
            System.out.println("欢迎登陆！");
            System.out.println("请选择您要操作的功能：");
            System.out.println("1、展示详情：");
            System.out.println("2、上架电影：");
            System.out.println("3、下架电影：");
            System.out.println("4、修改电影：");
            System.out.println("5、退出！");
            String command = ALL_sca.nextLine();
            switch (command){
                case "1":
                    selectMovies();
                    break;
                case "2":
                    try {
                        addMovies();
                    } catch (Exception e) {
                        e.printStackTrace();
                        LOGGER.error(loginUser.getLoginName() + "添加电影失败" + e);
                    }
                    break;
                case "3":
                    deleteMovies();
                    break;
                case "4":
                    try {
                        upDateMovies();
                    } catch (Exception e) {
                        e.printStackTrace();
                        LOGGER.trace(loginUser.getLoginName()+ "修改电影失败：" + e);
                    }
                    break;
                case "5":
                    LOGGER.trace("商家：" + loginUser.getLoginName() + "退出登陆");
                    return;
                default:
                    System.out.println("请选择正确的操作！");
                    LOGGER.trace(loginUser.getLoginName() + "商家选择操作错误！");
            }
        }

    }

    // 普通用户界面
    private static void showCustomerMain() {
        while (true) {
            System.out.println("==========影院用户界面==========");
            System.out.println("欢迎登陆！");
            System.out.println("请选择您要操作的功能：");
            System.out.println("1、查看所有影片：");
            System.out.println("2、根据电影名查询电影信息：");
            System.out.println("3、购票：");
            System.out.println("4、评分：");
            System.out.println("5、退出！");
            String command = ALL_sca.nextLine();
            switch (command){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    LOGGER.trace("用户：" + loginUser.getLoginName() + "退出登陆");
                    return;
                default:
                    System.out.println("请选择正确的操作！");
                    LOGGER.trace(loginUser.getLoginName() + "用户选择操作错误！");

            }
        }

    }

    public static User getUserByLoginName(String loginName){
        LOGGER.trace("开始登陆");
        // 判断用户集合中是否存在输入的用户名
        for (User user : ALL_USERS) {
            if (loginName.equals(user.getLoginName())){
                return user;
            }
        }
        LOGGER.trace("用户不存在");
        return null;
    }
    // 商家查询所有本商家的电影
    private static void selectMovies() {
        System.out.println("电影名称    主演    评分    时长    价格    余票    放映时间    ");
       // 先获取所有的key
        Set<Business> userKeys = ALL_MOVIES.keySet();
        //遍历map集合找到该商家的所有电影
        for (Business bus : userKeys) {
            if (loginUser.getLoginName().equals("shangjia1")&&loginUser.getLoginName().equals(bus.getLoginName())){
                for (Movie ls : ALL_MOVIES.get(bus)) {
                    System.out.println(ls);
                }
                LOGGER.trace(loginUser.getLoginName() + "查询电影成功");
            }else if(loginUser.getLoginName().equals("shangjia2")&&loginUser.getLoginName().equals(bus.getLoginName())){
                    for (Movie ls : ALL_MOVIES.get(bus)) {
                        System.out.println(ls);
                    }
                LOGGER.trace(loginUser.getLoginName() + "查询电影成功");
            }
        }
    }
    // 上架电影
    private static void addMovies() throws Exception {
        System.out.println("请输入电影名称：");
        String movieName = ALL_sca.nextLine();
        System.out.println("请输入电影主演：");
        String movieLead = ALL_sca.nextLine();
        System.out.println("请输入电影评分：");
        String movieScore = ALL_sca.nextLine();
        System.out.println("请输入电影时长：");
        String movieLongTime = ALL_sca.nextLine();
        System.out.println("请输入电影价格：");
        String moviePrice = ALL_sca.nextLine();
        System.out.println("请输入电影余票：");
        String movieNumber = ALL_sca.nextLine();
        System.out.println("请输入电影放映时间：");
        String movieStartTime = ALL_sca.nextLine();
        Movie mo = new Movie();
        mo.setMovieNmae(movieName);
        mo.setLead(movieLead);
        //将String类型的数字转换为Double
        Double dScore = new Double(movieScore);
        mo.setScore(dScore);
        Double dLongTime = new Double(movieLongTime);
        mo.setLongTime(dLongTime);
        Double dPrice = new Double(moviePrice);
        mo.setPrice(dPrice);
        Integer iNumber = new Integer(movieNumber);
        mo.setNumber(iNumber);
        //将字符串日期转换为时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mo.setStartTime(sdf.parse(movieStartTime));
        //将添加好的电影对象根据商家登陆名放入指定的list
        if (loginUser.getLoginName().equals("shangjia1")){
            movies1.add(mo);
            LOGGER.trace(loginUser.getLoginName() + "开始添加电影：" + movies1);
        }else {
            movies2.add(mo);
            LOGGER.trace(loginUser.getLoginName() + "开始添加电影：" + movies2);
        }
        // 将这个list 添加到电影map中指定的上架value下
        // 先获取所有的key
        Set<Business> userKeys = ALL_MOVIES.keySet();
        //遍历map集合找到该商家的所有电影
        for (Business bus : userKeys) {
            if (loginUser.getLoginName().equals("shangjia1")&&loginUser.getLoginName().equals(bus.getLoginName())){
                ALL_MOVIES.put(bus,movies1);
                LOGGER.trace(loginUser.getLoginName() + "成功添加电影：" + movies1);
            }else if(loginUser.getLoginName().equals("shangjia2")&&loginUser.getLoginName().equals(bus.getLoginName())){
                ALL_MOVIES.put(bus,movies2);
                LOGGER.trace(loginUser.getLoginName() + "成功添加电影：" + movies2);
            }
        }
        System.out.println(ALL_MOVIES);
    }
    // 商家下架电影
    private static void deleteMovies() {
        while (true) {
            System.out.println("请输入需要下架的电影名称");
            String inputMoviesName = ALL_sca.nextLine();
            LOGGER.info("开始下架电影:" + inputMoviesName);
            //定义set集合存放 All_movies 的所有key
            Set<Business> userKey = ALL_MOVIES.keySet();
            // 遍历userKey 找到与登陆用户相同的key
            to:for (Business business : userKey) {
                if (loginUser.getLoginName().equals(business.getLoginName())){
                    //拿到当前登陆商家的所有电影的list
                    for (Movie movie : ALL_MOVIES.get(business)) {
                        if (inputMoviesName.equals(movie.getMovieNmae())){
                            ALL_MOVIES.get(business).remove(movie);
                            LOGGER.trace(loginUser.getLoginName() + "下架电影成功:" + inputMoviesName);
                            return;
                        }else {
                            System.out.println("请输入正确的电影名称！");
                            LOGGER.trace(loginUser.getLoginName() + "下架电影失败,没有该电影:" + inputMoviesName);
                            break to;
                        }
                    }
                }
            }
        }
    }
    //商家修改电影
    private static void upDateMovies() throws Exception {
        while (true){
            System.out.println("请输入需要修改的电影名称");
            String inputMoviesName = ALL_sca.nextLine();
            //合并两个movies集合
            Collection<Movie> colMovies1 = new ArrayList<>(movies1);
            Collection<Movie> colMovies2 = new ArrayList<>(movies2);
            colMovies1.addAll(colMovies2);
            int NO = 0;
            for (Movie movie : colMovies1) {
                if (!inputMoviesName.equals(movie.getMovieNmae())){
                    NO++;
                }
            }
            if (NO == colMovies1.size()){
                System.out.println("请输入正确的电影名称！");
                LOGGER.trace(loginUser.getLoginName()+ "修改电影失败，没有该电影1：" + inputMoviesName);
                continue;
            }
            LOGGER.info(loginUser.getLoginName() + "开始修改电影:" + inputMoviesName);
            //定义set集合存放 All_movies 的所有key
            Set<Business> userKey = ALL_MOVIES.keySet();
            // 遍历userKey 找到与登陆用户相同的key
            for (Business business : userKey) {
                if (loginUser.getLoginName().equals(business.getLoginName())){
                    //定义计数器，用于记录循环次数
                    int upMovieForMovies = 0;
                    //拿到当前登陆商家的所有电影的list
                    for (Movie movie : ALL_MOVIES.get(business)) {
                        if (inputMoviesName.equals(movie.getMovieNmae())){
                            System.out.println("请输入新电影名称：");
                            String movieName = ALL_sca.nextLine();
                            System.out.println("请输入新电影主演：");
                            String movieLead = ALL_sca.nextLine();
                            System.out.println("请输入新电影评分：");
                            String movieScore = ALL_sca.nextLine();
                            System.out.println("请输入新电影时长：");
                            String movieLongTime = ALL_sca.nextLine();
                            System.out.println("请输入新电影价格：");
                            String moviePrice = ALL_sca.nextLine();
                            System.out.println("请输入新电影余票：");
                            String movieNumber = ALL_sca.nextLine();
                            System.out.println("请输入新电影放映时间：");
                            String movieStartTime = ALL_sca.nextLine();
                            //将添加好的电影对象根据商家登陆名放入指定的list
                            if (loginUser.getLoginName().equals("shangjia1")){
//                                movies1.add(mo);
                                for (Movie movie1 : movies1) {
                                    if (inputMoviesName.equals(movie1.getMovieNmae())){
                                        movie1.setMovieNmae(movieName);
                                        movie1.setLead(movieLead);
                                        //将String类型的数字转换为Double
                                        Double dScore = new Double(movieScore);
                                        movie1.setScore(dScore);
                                        Double dLongTime = new Double(movieLongTime);
                                        movie1.setLongTime(dLongTime);
                                        Double dPrice = new Double(moviePrice);
                                        movie1.setPrice(dPrice);
                                        Integer iNumber = new Integer(movieNumber);
                                        movie1.setNumber(iNumber);
                                        //将字符串日期转换为时间格式
                                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                        movie1.setStartTime(sdf.parse(movieStartTime));
                                    }
                                }
                            }else {
                                for (Movie movie1 : movies2) {
                                    if (inputMoviesName.equals(movie1.getMovieNmae())){
                                        movie1.setMovieNmae(movieName);
                                        movie1.setLead(movieLead);
                                        //将String类型的数字转换为Double
                                        Double dScore = new Double(movieScore);
                                        movie1.setScore(dScore);
                                        Double dLongTime = new Double(movieLongTime);
                                        movie1.setLongTime(dLongTime);
                                        Double dPrice = new Double(moviePrice);
                                        movie1.setPrice(dPrice);
                                        Integer iNumber = new Integer(movieNumber);
                                        movie1.setNumber(iNumber);
                                        //将字符串日期转换为时间格式
                                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                        movie1.setStartTime(sdf.parse(movieStartTime));
                                    }
                                }
                            }
                            // 将这个list 添加到电影map中指定的上架value下
                            // 先获取所有的key
                            Set<Business> userKeys = ALL_MOVIES.keySet();
                            //遍历map集合找到该商家的所有电影
                            for (Business bus : userKeys) {
                                if (loginUser.getLoginName().equals("shangjia1")&&loginUser.getLoginName().equals(bus.getLoginName())){
                                    ALL_MOVIES.put(bus,movies1);
                                    LOGGER.trace(loginUser.getLoginName() + "修改电影成功：" + movies1);
                                }else if(loginUser.getLoginName().equals("shangjia2")&&loginUser.getLoginName().equals(bus.getLoginName())){
                                    ALL_MOVIES.put(bus,movies2);
                                    LOGGER.trace(loginUser.getLoginName() + "修改电影成功：" + movies2);
                                }
                            }
                            System.out.println(ALL_MOVIES);
                            return;
                        }else {
                            upMovieForMovies++;
                        }
                    }
                    if (upMovieForMovies == ALL_MOVIES.get(business).size()){
                        System.out.println("请输入正确的电影名称！");
                        LOGGER.trace(loginUser.getLoginName() + "修改电影失败,没有该电影:" + inputMoviesName);
                        break;
                    }
                }
            }
        }
    }

}
