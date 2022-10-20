package com.example.drawshapes

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class CanvasView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        //Create paint Object
        val paint : Paint = Paint()

        //Fill Circle
        paint.setColor(Color.CYAN)
        paint.style= Paint.Style.FILL
        canvas?.drawCircle(400f,600f,200f,paint)

        //Empty Circle
        paint.setColor(Color.RED)
        paint.style= Paint.Style.STROKE
        paint.strokeWidth = 4f
        canvas?.drawCircle(220f,220f,200f,paint)

        //Empty Triangle
        val path : Path = Path()
        path.moveTo(600f,400f)
        path.lineTo(1000f,1400f)
        path.lineTo(200f,1400f)
        path.close()
        paint.setColor(Color.RED)
        paint.style= Paint.Style.STROKE
        paint.strokeWidth = 4f
        canvas?.drawPath(path,paint)


        //Fill Triangle
        val path1 : Path = Path()
        path1.moveTo(600f,2400f)
        path1.lineTo(1000f,1400f)
        path1.lineTo(1200f,2400f)
        path1.close()
        paint.setColor(Color.RED)
        paint.style= Paint.Style.FILL
        paint.strokeWidth = 4f
        canvas?.drawPath(path1,paint)

//        val path2 : Path = Path()
//        path2.moveTo(600f,400f)
//        path2.lineTo(1000f,1400f)
//        path2.lineTo(200f,1400f)
//        path2.lineTo(200f,300f)
//        path2.close()
//        paint.setColor(Color.GREEN)
//        paint.style= Paint.Style.STROKE
//        paint.strokeWidth = 4f
//        canvas?.drawPath(path2,paint)
    }
}