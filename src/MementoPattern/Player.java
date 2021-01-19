package MementoPattern;

/**
 * @author:YiMing
 * @create:2021/1/19,17:12
 * @version:1.0
 * 【玩家】
 */
public class Player {
    //存档名
    private String archiveName;

    public void setArchive(String archiveName){
        this.archiveName = archiveName;
    }

    public String getArchive(){
        return archiveName;
    }

    public Archive saveArchiveNameToArchive(){
        return new Archive(archiveName);
    }

    public void getArchiveNameFromArchive(Archive archive){
        archiveName = archive.getName();
    }
}
