package cn.edu.sdwu.android02.classroom.sn170507180224;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        //接收广播时自动调用
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //获取广播内容
        String content=intent.getStringExtra("key1");
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();

    }
}
