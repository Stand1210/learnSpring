/**
 * Created by stand on 2017/2/19.
 */
package main;

public class AutoWritingService {


    private AutoWritingDAO autoWritingDAO;

    public AutoWritingService(AutoWritingDAO autoWritingDAO) {
        System.out.println("构造器");
        this.autoWritingDAO = autoWritingDAO;
    }


    //public void setAutoWritingDAO(AutoWritingDAO autoWritingDAO) {
    //    System.out.println("set方法")
    //    this.autoWritingDAO = autoWritingDAO;
    //}



    public void say() {
        autoWritingDAO.say("test say");
    }
}
