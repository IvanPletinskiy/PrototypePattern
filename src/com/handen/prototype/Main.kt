package com.handen.prototype

import java.util.*

fun main() {
    val shapes = ArrayList<Shape>()
    val shapesCopy = ArrayList<Shape>()

    val circle = Circle()
    circle.x = 10
    circle.y = 20
    circle.radius = 15
    circle.color = "red"
    shapes.add(circle)

    val anotherCircle = circle.clone() as Circle
    shapes.add(anotherCircle)

    val rectangle = Rectangle()
    rectangle.width = 10
    rectangle.height = 20
    rectangle.color = "blue"
    shapes.add(rectangle)

    cloneAndCompare(shapes, shapesCopy)
}

private fun cloneAndCompare(shapes: List<Shape>, shapesCopy: MutableList<Shape>) {
    for (shape in shapes) {
        shapesCopy.add(shape.clone())
    }

    for (i in shapes.indices) {
        if (shapes[i] !== shapesCopy[i]) {
            println("$i: Shapes are different objects (yay!)")
            if (shapes[i] == shapesCopy[i]) {
                println("$i: And they are identical (yay!)")
            } else {
                println("$i: But they are not identical (booo!)")
            }
        } else {
            println("$i: Shape objects are the same (booo!)")
        }
    }
}