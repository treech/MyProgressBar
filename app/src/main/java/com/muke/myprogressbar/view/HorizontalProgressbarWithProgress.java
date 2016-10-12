package com.muke.myprogressbar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;

import com.muke.myprogressbar.R;

/**
 * Created by Administrator on 2016/10/9 0009.
 */

public class HorizontalProgressbarWithProgress extends ProgressBar {

    //初始化模默认参数
    private static final int DEFAULT_TEXT_SIZE = 10;//sp
    private static final int DEFAULT_TEXT_COLOR = 0xFFFC00D1;
    private static final int DEFAULT_COLOR_UNREACH = 0xFFD3D6DA;
    private static final int DEFAULT_HEIGHT_UNREACH = 10;//dp
    private static final int DEFAULT_COLOR_REACH = DEFAULT_TEXT_COLOR;
    private static final int DEFAULT_HEIGHT_REACH= 2;//dp
    private static final int DEFAULT_TEXT_OFFSET = 10;//dp


    protected  int mTextSize = sp2px(DEFAULT_TEXT_SIZE);
    protected  int mTextColor = DEFAULT_TEXT_COLOR;
    protected  int mUnreachColor = DEFAULT_COLOR_UNREACH;
    protected  int mUnreachHeight = dp2dx(DEFAULT_HEIGHT_UNREACH);
    protected  int mReachColor = DEFAULT_COLOR_REACH;
    protected  int mReachHeight = dp2dx(DEFAULT_HEIGHT_REACH);
    protected  int mTextOffset = dp2dx(DEFAULT_TEXT_OFFSET);


    public HorizontalProgressbarWithProgress(Context context) {
        this(context,null);
    }

    public HorizontalProgressbarWithProgress(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public HorizontalProgressbarWithProgress(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        obtainStyledAttrs(attrs);
    }

    private void obtainStyledAttrs(AttributeSet attrs) {

        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.HorizontalProgressbarWithProgress);
        mTextSize = (int) ta.getDimension(R.styleable.HorizontalProgressbarWithProgress_progress_text_size, mTextSize);
        mTextColor = ta.getColor(R.styleable.HorizontalProgressbarWithProgress_progress_text_color, mTextColor);
        mUnreachColor = ta.getColor(R.styleable.HorizontalProgressbarWithProgress_progress_unreach_color, mUnreachColor);
        mUnreachHeight = (int) ta.getDimension(R.styleable.HorizontalProgressbarWithProgress_progress_unreach_height, mUnreachHeight);
        mReachColor = ta.getColor(R.styleable.HorizontalProgressbarWithProgress_progress_reach_color, mReachColor);
        mReachHeight = (int) ta.getDimension(R.styleable.HorizontalProgressbarWithProgress_progress_reach_height, mReachHeight);
        mTextOffset = (int) ta.getDimension(R.styleable.HorizontalProgressbarWithProgress_progress_text_offset, mTextOffset);
    }


    //dp->dx
    protected int dp2dx(int dpValue){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpValue, getResources().getDisplayMetrics());
    }

    protected int sp2px(int spValue){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spValue, getResources().getDisplayMetrics());
    }
}
