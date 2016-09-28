package com.tlf.basic;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;

/**
 * User: qii
 * Date: 14-1-31
 */
public class ViewFindUtils {

    /**
     * ViewHolder简洁写法,避免适配器中重复定义ViewHolder,减少代码量 用法:
     * <p/>
     * <pre>
     * if (convertView == null) {
     * 	convertView = View.inflate(mContext, R.layout.ad_demo, null);
     * }
     * TextView tv_demo = ViewHolderUtils.get(convertView, R.id.tv_demo);
     * ImageView iv_demo = ViewHolderUtils.get(convertView, R.id.iv_demo);
     * </pre>
     */
    public static <T extends View> T hold(View view, int id) {
        SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();

        if (viewHolder == null) {
            viewHolder = new SparseArray<View>();
            view.setTag(viewHolder);
        }

        View childView = viewHolder.get(id);

        if (childView == null) {
            childView = view.findViewById(id);
            viewHolder.put(id, childView);
        }

        return (T) childView;
    }

    @SuppressWarnings({"unchecked", "UnusedDeclaration"})
    public static <T extends View> T find(View view, int id) {
        return (T) view.findViewById(id);
    }

    @SuppressWarnings({"unchecked", "UnusedDeclaration"})
    public static <T extends View> T find(Activity activity, int id) {
        return (T) activity.findViewById(id);
    }
}
