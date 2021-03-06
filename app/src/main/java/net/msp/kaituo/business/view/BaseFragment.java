package net.msp.kaituo.business.view;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

/**
 * Business
 *
 * @author kaituo:马世鹏
 * @create 2018/9/5 15:16
 * @fuction 主要是为我们所有的fragment提供公共的行为或者事件
 **/
public class BaseFragment extends Fragment {

    protected Activity mContext;

    /**
     * 申请指定的权限.
     */
    public void requestPermission(int code, String... permissions) {

        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(permissions, code);
        }
    }

    /**
     * 判断是否有指定的权限
     */
    public boolean hasPermission(String... permissions) {

        for (String permisson : permissions) {
            if (ContextCompat.checkSelfPermission(getActivity(), permisson)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        switch (requestCode) {
//            case Constant.HARDWEAR_CAMERA_CODE:
//                if (grantResults.length > 0
//                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    doOpenCamera();
//                }
//                break;
//            case Constant.WRITE_READ_EXTERNAL_CODE:
//                if (grantResults.length > 0
//                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    doWriteSDCard();
//                }
//                break;
//        }
//    }

    public void doOpenCamera() {

    }

    public void doWriteSDCard() {

    }
}
