package com.handen.prototype


class Rectangle(target: Rectangle?): Shape(target) {

    var height: Int = target?.height ?: 0
    var width: Int = target?.width ?: 0



    constructor(): this(null)

    override fun clone(): Shape {
        return Rectangle(this)
    }

    override fun equals(object2: Any?): Boolean {
        if (object2 !is Rectangle || !super.equals(object2)) return false
        return object2.width == width && object2.height == height
    }
}