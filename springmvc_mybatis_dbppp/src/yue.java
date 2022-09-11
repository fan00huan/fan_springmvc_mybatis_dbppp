import java.text.SimpleDateFormat;
import java.util.Calendar;  
 
public class yue {  
 
    public static void main(String[] args) {
        //获取当前时间
        Calendar cal = Calendar.getInstance();
        //下面可以设置月份，注：月份设置要减1，所以设置1月就是1-1，设置2月就是2-1，如此类推
        cal.set(Calendar.MONTH, 1-1);
        //调到上个月
        cal.add(Calendar.MONTH, -1);
        //得到一个月最最后一天日期(31/30/29/28)
        int MaxDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //按你的要求设置时间
        cal.set( cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), MaxDay, 23, 59, 59);
        //按格式输出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        System.out.println(sdf.format(cal.getTime()));
    }
}  