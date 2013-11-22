package scala.main

import org.lwjgl.opengl.Display

object Player {
  def main(){
    Paddle.draw(Paddle.xPos, Paddle.yPos)
  }

  def reset() : Any = {
    Paddle.xPos = 10
    Paddle.yPos = (Display.getHeight() / 2) - (Paddle.height / 2)
    this.main()
  }
}
