package com.gadarts.returnfire.components

import com.badlogic.gdx.math.Vector2

class PlayerComponent : GameComponent() {
    var thrust: Float = 0.0f
    private val blastVelocity = Vector2()
    private var fuel: Int = INITIAL_FUEL
    var currentVelocity = 0F
    var strafing: Float? = null
    private var primaryAmmo: Int = INITIAL_AMMO_PRIMARY
    private var secondaryAmmo: Int = INITIAL_AMMO_SECONDARY

    override fun reset() {
    }

    fun getBlastVelocity(output: Vector2): Vector2 {
        return output.set(blastVelocity)
    }

    fun init() {
        this.fuel = INITIAL_FUEL
        this.currentVelocity = 0F
        this.primaryAmmo = INITIAL_AMMO_PRIMARY
        this.secondaryAmmo = INITIAL_AMMO_SECONDARY
    }

    fun setBlastVelocity(velocity: Vector2) {
        blastVelocity.set(velocity)
    }

    companion object {
        const val INITIAL_FUEL = 100
        const val INITIAL_AMMO_PRIMARY = 500
        const val INITIAL_AMMO_SECONDARY = 10
    }
}
