RISC-V SOC SETUP
=============================

## Clone the repo

    git clone https://github.com/nmcicek/riscv-soc
    ./init.sh

## Install tools

### Build GNU Toolchain
    
    ./install_toolchain.sh

### Build RISC-V Tools

    ./build_tools.sh

## For verilog generation

    make sram

## For verilator simulation    

### Simulation without VCD

    export RISCV=/path/to/riscv/toolchain
    make sim

### Simulation with VCD

    export RISCV=/path/to/riscv/toolchain
    make sim trace_en=1

    
