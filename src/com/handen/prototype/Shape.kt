package com.handen.prototype


abstract class Shape() {
    var x: Int = 0
    var y: Int = 0
    lateinit var color: String

    constructor(target: Shape?) : this() {
        if (target != null) {
            this.x = target.x
            this.y = target.y
            this.color = target.color
        }
    }

    abstract fun clone(): Shape

    override fun equals(other: Any?): Boolean {
        if (other !is Shape) return false
        return other.x == x && other.y == y && other.color == color
    }
}