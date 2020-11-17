package Prototype;

import java.io.Closeable;

/**
 * @author:YiMing
 * @create:2020/11/16,20:31
 * @version:1.0
 */
public class Resume implements Cloneable {

    private int age;
    private String name;

    private JobExperience je;

    public Resume() {
        this.je = new JobExperience();
    }

    //设置个人信息
    public void setPersonInfo(int age,String name){
        this.age = age;
        this.name = name;
    }
    //设置工作经历
    public void setJobException(String time, String company){
        je.Time = time;
        je.Company = company;
    }

    public void show(){
        System.out.println(name+age);
        System.out.println("工作经历："+je.Company+"-----"+je.Time);
    }


    /*深复制体现 方法一*/
    /*@Override
    public Resume clone() {
        Resume clone = null;
        try {
            clone = (Resume)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }*/

    /*深复制体现 方法二*/
    @Override
    public Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        return resume;
    }
}
