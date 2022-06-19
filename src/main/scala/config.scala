package top

import chisel3._

import chipsalliance.rocketchip.config._

case object AcceleratorKey extends Field[AcceleratorParams]

case class AcceleratorParams(
    length: Int = 32,
    scale:  Int = 16
)

class DefaultAcceleratorConfig extends Config((site, here, up) => {
  case AcceleratorKey => AcceleratorParams(
    length = 9,
    scale = 16, 
  )
})