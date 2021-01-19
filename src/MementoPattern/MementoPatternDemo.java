package MementoPattern;

/**
 * @author:YiMing
 * @create:2021/1/19,17:19
 * @version:1.0
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Player player = new Player();
        ArchiveManager archiveManager = new ArchiveManager();

        player.setArchive("第一次存档");
        archiveManager.add(player.saveArchiveNameToArchive());
        player.setArchive("第二次存档");
        archiveManager.add(player.saveArchiveNameToArchive());
        player.setArchive("第三次存档");
        archiveManager.add(player.saveArchiveNameToArchive());

        //读档
        System.out.println("玩家读取最新存档:"+player.getArchive());
        player.getArchiveNameFromArchive(archiveManager.get(0));
        System.out.println("玩家读取第一次存档:"+player.getArchive());
    }
}
