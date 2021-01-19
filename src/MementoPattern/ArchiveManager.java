package MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2021/1/19,17:07
 * @version:1.0
 * 【存档管理器】
 */
public class ArchiveManager {
    List<Archive> archiveManagerList = new ArrayList();

    //将Archive添加到管理器中
    public void add(Archive archive) {
        archiveManagerList.add(archive);
    }
    //在管理器中查找Archive
    public Archive get(int index) {
        return archiveManagerList.get(index);
    }
}
