package com.listonic.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.content.res.AppCompatResources
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.DayViewDecorator
import com.prolificinteractive.materialcalendarview.DayViewFacade
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar.topbarVisible = false

        calendar.selectedDate = CalendarDay.today()

        calendar.addDecorator(object : DayViewDecorator {

            override fun shouldDecorate(day: CalendarDay?): Boolean {
                return true
            }

            override fun decorate(view: DayViewFacade) {
                view.setSelectionDrawable(
                    AppCompatResources.getDrawable(this@MainActivity, R.drawable.selector_calendar_selected_date_first_day_of_current_week) ?: return
                )
            }

        })
    }
}
