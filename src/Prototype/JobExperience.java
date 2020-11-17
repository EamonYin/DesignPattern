package Prototype;

/**
 * @author:YiMing
 * @create:2020/11/16,21:12
 * @version:1.0
 */
public class JobExperience {
    public String Time;
    public String Company;

    public JobExperience(String time, String company) {
        Time = time;
        Company = company;
    }

    public JobExperience() {
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }


}
