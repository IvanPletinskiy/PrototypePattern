package com.handen.prototype

class Circle(target: Circle?): Shape(target) {

    var radius: Int = target?.radius ?: 0

    constructor(): this(null)


    override fun clone(): Shape {
        return Circle(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Circle || !super.equals(other)) return false
        return other.radius == radius
    }


}