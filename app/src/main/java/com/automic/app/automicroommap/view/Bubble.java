package com.automic.app.automicroommap.view;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * 类注释：
 * Created by sujingtai on 2017/7/6 0006 下午 4:54
 */

public class Bubble 	{
//    ImageMap.Area _a;
//    String _text;
//    float _x;
//    float _y;
//    int _h;
//    int _w;
//    int _baseline;
//    float _top;
//    float _left;
//
//    Bubble(String text, float x, float y)
//    {
//        init(text,x,y);
//    }
//
//    Bubble(String text, int areaId)
//    {
//        _a = mIdToArea.get(areaId);
//        if (_a != null) {
//            float x = _a.getOriginX();
//            float y = _a.getOriginY();
//            init(text,x,y);
//        }
//    }
//
//    void init(String text, float x, float y)
//    {
//        _text = text;
//        _x = x*mResizeFactorX;
//        _y = y*mResizeFactorY;
//        Rect bounds = new Rect();
//        textPaint.setTextScaleX(1.0f);
//        textPaint.getTextBounds(text, 0, _text.length(), bounds);
//        _h = bounds.bottom-bounds.top+20;
//        _w = bounds.right-bounds.left+20;
//
//        if (_w>mViewWidth) {
//            // too long for the display width...need to scale down
//            float newscale=((float)mViewWidth/(float)_w);
//            textPaint.setTextScaleX(newscale);
//            textPaint.getTextBounds(text, 0, _text.length(), bounds);
//            _h = bounds.bottom-bounds.top+20;
//            _w = bounds.right-bounds.left+20;
//        }
//
//        _baseline = _h-bounds.bottom;
//        _left = _x - (_w/2);
//        _top = _y - _h - 30;
//
//        // try to keep the bubble on screen
//        if (_left < 0) {
//            _left = 0;
//        }
//        if ((_left + _w) > mExpandWidth) {
//            _left = mExpandWidth - _w;
//        }
//        if (_top < 0) {
//            _top = _y + 20;
//        }
//    }
//
//    public boolean isInArea(float x, float y) {
//        boolean ret = false;
//
//        if ((x>_left) && (x<(_left+_w))) {
//            if ((y>_top)&&(y<(_top+_h))) {
//                ret = true;
//            }
//        }
//
//        return ret;
//    }
//
//    void onDraw(Canvas canvas)
//    {
//        if (_a != null) {
//            // Draw a shadow of the bubble
//            float l = _left + mScrollLeft + 4;
//            float t = _top + mScrollTop + 4;
//            canvas.drawRoundRect(new RectF(l,t,l+_w,t+_h), 20.0f, 20.0f, bubbleShadowPaint);
//            Path path = new Path();
//            float ox=_x+ mScrollLeft+ 1;
//            float oy=_y+mScrollTop+ 1;
//            int yoffset=-35;
//            if (_top > _y) {
//                yoffset=35;
//            }
//            // draw shadow of pointer to origin
//            path.moveTo(ox,oy);
//            path.lineTo(ox-5,oy+yoffset);
//            path.lineTo(ox+5+4,oy+yoffset);
//            path.lineTo(ox, oy);
//            path.close();
//            canvas.drawPath(path, bubbleShadowPaint);
//
//            // draw the bubble
//            l = _left + mScrollLeft;
//            t = _top + mScrollTop;
//            canvas.drawRoundRect(new RectF(l,t,l+_w,t+_h), 20.0f, 20.0f, bubblePaint);
//            path = new Path();
//            ox=_x+ mScrollLeft;
//            oy=_y+mScrollTop;
//            yoffset=-35;
//            if (_top > _y)
//            {
//                yoffset=35;
//            }
//            // draw pointer to origin
//            path.moveTo(ox,oy);
//            path.lineTo(ox-5,oy+yoffset);
//            path.lineTo(ox+5,oy+yoffset);
//            path.lineTo(ox, oy);
//            path.close();
//            canvas.drawPath(path, bubblePaint);
//
//            // draw the message
//            canvas.drawText(_text,l+(_w/2),t+_baseline-10,textPaint);
//        }
//    }
//
//    void onTapped() {
//        // bubble was tapped, notify listeners
//        if (mCallbackList != null) {
//            for (ImageMap.OnImageMapClickedHandler h : mCallbackList) {
//                h.onBubbleClicked(_a.getId());
//            }
//        }
//    }
}
