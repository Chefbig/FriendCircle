package razerdp.friendcircle.app.mvp.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.List;

import razerdp.github.com.common.mvp.models.entity.CommentInfo;
import razerdp.github.com.common.mvp.models.entity.LikesInfo;
import razerdp.friendcircle.ui.widget.commentwidget.CommentWidget;
import razerdp.github.com.baselibrary.mvp.IBaseView;
import razerdp.github.com.common.mvp.models.entity.MomentsInfo;

/**
 * Created by 大灯泡 on 2016/12/7.
 */

public interface IMomentView extends IBaseView {

    void onLikeChange(int itemPos, List<LikesInfo> likeUserList);

    void onCommentChange(int itemPos, List<CommentInfo> commentInfoList);

    /**
     * 因为recyclerview通过位置找到itemview有可能会找不到对应的View，所以这次直接传值
     *
     * @param viewHolderRootView
     * @param itemPos
     * @param momentid
     * @param commentWidget
     */
    void showCommentBox(@Nullable View viewHolderRootView, int itemPos, String momentid, CommentWidget commentWidget);

    void onDeleteMomentsInfo(@NonNull MomentsInfo momentsInfo);

}
