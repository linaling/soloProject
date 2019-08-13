package solo.shinhan.com.solo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class CollocateFurnitureView extends View {
    private Bitmap bitmap;
    private Bitmap testBitmap;
    float x = 980;
    float y = 420;
    float currentX;
    float currentY;

    public CollocateFurnitureView(Context context, AttributeSet attrs) {
        super(context);
    }

    public CollocateFurnitureView(Context context, String category, int furnitureType) {
        super(context);
        SoloSingleton.getInstance().setCurrentFurnitureCategory(category);
        SoloSingleton.getInstance().setCurrentFurnitureType(furnitureType);

        if(!(SoloSingleton.getInstance().getCurrentFurnitureCategory().equals("not"))){
            ArrayList<FurnitureInfo> furnitureInfos =  SoloSingleton.getInstance().getFurnitureMap().get(SoloSingleton.getInstance().getCurrentFurnitureCategory());
            bitmap = furnitureInfos.get(SoloSingleton.getInstance().getCurrentFurnitureType()).getFurnitureImage();
            bitmap = resizeBitmapImage(bitmap,150);
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        if(!(SoloSingleton.getInstance().getCurrentFurnitureCategory().equals("not"))){
            ArrayList<FurnitureInfo> furnitureInfos =  SoloSingleton.getInstance().getFurnitureMap().get(SoloSingleton.getInstance().getCurrentFurnitureCategory());
            bitmap = furnitureInfos.get(SoloSingleton.getInstance().getCurrentFurnitureType()).getFurnitureImage();
            bitmap = resizeBitmapImage(bitmap,150);
        }
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                if(x-5< currentX&& x+5 >currentX &&y-5<currentY&& y+5>currentY){
                    x = event.getX();
                    y = event.getY();
                    invalidate();
                }
                break;
            case MotionEvent.ACTION_MOVE:
                x = event.getX();
                y = event.getY();
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                currentX = event.getX();
                currentY = event.getY();
                testBitmap = bitmap;
                invalidate();
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        if(bitmap != null) {
            canvas.drawBitmap(bitmap, x, y, null);
        }

        if(testBitmap != null) {
            canvas.drawBitmap(testBitmap,currentX,currentY,null);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);

    }

    public Bitmap resizeBitmapImage(Bitmap source, int maxResolution)
    {
        int width = source.getWidth();
        int height = source.getHeight();
        int newWidth = width;
        int newHeight = height;
        float rate = 0.0f;

        if(width > height)
        {
            if(maxResolution < width)
            {
                rate = maxResolution / (float) width;
                newHeight = (int) (height * rate);
                newWidth = maxResolution;
            }
        }
        else
        {
            if(maxResolution < height)
            {
                rate = maxResolution / (float) height;
                newWidth = (int) (width * rate);
                newHeight = maxResolution;
            }
        }

        return Bitmap.createScaledBitmap(source, newWidth, newHeight, true);
    }
}
