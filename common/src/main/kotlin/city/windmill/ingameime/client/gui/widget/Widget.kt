package city.windmill.ingameime.client.gui.widget

import net.minecraft.client.gui.Font
import net.minecraft.client.gui.GuiGraphics

abstract class Widget(val font: Font) : net.minecraft.client.gui.components.Renderable {
    var offsetX = 0
    var offsetY = 0
    var textColor = 0xFF_00_00_00.toInt()

    @Suppress("MemberVisibilityCanBePrivate")
    var backgroundColor = 0xEB_EB_EB_EB.toInt()
    open val active get() = false
    open val width get() = padding.first * 2
    open val height get() = padding.second * 2
    open val padding = 0 to 0

    override fun render(guiGraphics: GuiGraphics, mouseX: Int, mouseY: Int, delta: Float) {
        if (active)
            draw(guiGraphics, offsetX, offsetY, mouseX, mouseY, delta)
    }

    open fun draw(guiGraphics: GuiGraphics, offsetX: Int, offsetY: Int, mouseX: Int, mouseY: Int, delta: Float) {
        //Background
        guiGraphics.fill(
            offsetX,
            offsetY,
            offsetX + width,
            offsetY + height,
            backgroundColor
        )
    }

    fun moveTo(x: Int, y: Int) {
        offsetX = x
        offsetY = y
    }
}