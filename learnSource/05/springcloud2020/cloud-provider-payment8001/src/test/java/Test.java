import com.alibaba.fastjson.JSONArray;
import com.atguigu.springcloud.dao.PaymentDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 血残微
 * @version 1.0
 * @Date 2020/7/13 14:07
 **/
@Aspect
public class Test {

    private final String POINT_CUT = "execution(* com..service.*.*(..))";

    @Pointcut(POINT_CUT)
    public void pointCut(){}

    /**
     * 在切点方法之前执行
     * @param joinPoint
     */
   /* @Before(value="pointCut()")
    public void doBefore(JoinPoint joinPoint){
        if (joinPoint.getTarget() in    stanceof PaymentDao) {
            joinPoint.getTarget();
        }
        System.out.println("@Before：切点方法之前执行.....");
    }*/

    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint) {
        if (joinPoint.getTarget() instanceof PaymentDao) {
            joinPoint.getTarget();
        }
        System.out.println("@After：切点方法之后执行.....");
    }

    @AfterReturning
    public void doAfterReturn(JoinPoint joinPoint){

    }

    public static void main(String[] args) {
        /*JSONArray json = new JSONArray();
        json.add("123");
        List<Integer> rawList = IntStream.  rangeClosed(1, 100000).boxed().collect(Collectors.toList());
        rawList.add(123);
        System.out.println(rawList);
        rawList.clear();
        System.out.println(rawList);*/
        String str = ".0";
        if(str.indexOf(".")>0) {
            str = str.replaceAll("0+?$","");
            str = str.replaceAll("[.]$","");
        }
        System.out.println(str);

        String str1 = ".0";
        if(str1.contains(".")) {
            str1 = str1.replaceAll("0+?$","");
            str1 = str1.replaceAll("[.]$","");
        }
        System.out.println(str1);

        Jedis jedis = new Jedis("localhost");
        System.out.println("连接redis");
        jedis.lpush("site-list", "7");
        jedis.lpush("site-list", "8");
        jedis.lpush("site-list", "9");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0 ,2);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
    }


}
