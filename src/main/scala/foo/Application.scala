package foo

import com.typesafe.scalalogging.StrictLogging
import kamon.Kamon

object Application extends App with StrictLogging {
  Kamon.init()
  Kamon.runWithContextTag("application-startup-marker", value = true)(logger.info("Application starting..."))
}
