package Prototype;

/**
 * @author:YiMing
 * @create:2020/11/16,21:25
 * @version:1.0
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resumeA = new Resume();
        resumeA.setPersonInfo(12,"张三");
        resumeA.setJobException("2020-10-3","华为");
        resumeA.show();

        /**深复制体现
         *克隆A属性并只修改了JobException，姓名，年龄并没有改变
         * 阳关道和独木桥
         */
        Resume resumeB = resumeA.clone();
        resumeB.setJobException("2016-12-30","腾讯");
        resumeB.show();
    }
}
