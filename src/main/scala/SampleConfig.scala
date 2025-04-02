import com.typesafe.config.ConfigFactory
import scala.jdk.CollectionConverters._
object SampleConfig {
  //cargamos la configuracion que hemos hecho antes en resources
  val cfg = ConfigFactory.load()
  val server = cfg.getConfig("SampleConfig").getString("servidor")
  val port = cfg.getConfig("SampleConfig").getString("puerto")
  val stations = cfg.getConfig("SampleConfig").getStringList("estaciones")// java.util.List<string>
  val asScalaList = stations.asScala.toList // Para poder hacer una conversion de un lenguaje y otro. Manejo de tipos de listas entre lenguajes.
}
