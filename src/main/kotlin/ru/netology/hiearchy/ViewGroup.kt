package ru.netology.hiearchy

class ViewGroup: View() {
    private var view: View? = null
    fun addView(value:View) {
      view=value;
    }
}