
package top

import Chisel._
import Chisel.ImplicitConversions._
import freechips.rocketchip.config.Parameters
import freechips.rocketchip.diplomacy._
import freechips.rocketchip.tilelink._
import freechips.rocketchip.util._

import chipsalliance.rocketchip.config._

class ExampleTop(implicit p: Parameters) extends Module {
  val io = new Bundle {
    val in1 = Bits(INPUT,  p(AcceleratorKey).length)
    val in2 = Bits(INPUT,  p(AcceleratorKey).length)
    val out = Bits(OUTPUT, p(AcceleratorKey).length)
    val success = Bits(OUTPUT, 1)
  }

	io.out := io.in1 + io.in2
        ElaborationArtefacts.add("plusArgs", PlusArgArtefacts.serialize_cHeader)
}
