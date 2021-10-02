package command.instance;

import client.InnerClient;
import common.struct.PandisString;
import common.struct.impl.Sds;

import java.util.concurrent.TimeUnit;

/**
 * psetex命令
 * 命令格式：PSETEX key milliseconds value
 * @author: huzihan
 * @create: 2021-09-27
 */
public class PsetexCommand extends GenericSetCommand {

    public PsetexCommand() {
        super("psetex", 4, false, "wm");
    }

    @Override
    public void execute(InnerClient client) {
        Sds[] commandArgs = client.getCommandArgs().toArray(new Sds[0]);

        // 调用通用的set方法，将key/value保存
        PandisString key = commandArgs[1];
        Sds expireTime = commandArgs[2];                  // 超时时间
        PandisString value = commandArgs[3];

        genericSet(client, SET_NO_FLAGS, key, value, expireTime, TimeUnit.MILLISECONDS);
    }
}
