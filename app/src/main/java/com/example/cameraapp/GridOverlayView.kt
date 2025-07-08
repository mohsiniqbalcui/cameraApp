package com.example.cameraapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class GridOverlayView(context: Context, attrs: AttributeSet?) : View(context, attrs) {
    private val paint = Paint().apply {
        color = Color.WHITE
        strokeWidth = 2f
        style = Paint.Style.STROKE
        isAntiAlias = true
        alpha = 100 // slight transparency
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val thirdWidth = width / 3f
        val thirdHeight = height / 3f

        // Draw vertical lines
        canvas.drawLine(thirdWidth, 0f, thirdWidth, height.toFloat(), paint)
        canvas.drawLine(2 * thirdWidth, 0f, 2 * thirdWidth, height.toFloat(), paint)

        // Draw horizontal lines
        canvas.drawLine(0f, thirdHeight, width.toFloat(), thirdHeight, paint)
        canvas.drawLine(0f, 2 * thirdHeight, width.toFloat(), 2 * thirdHeight, paint)
    }
}
