RISC-V SOC SETUP
=============================

## Build GNU Toolchain

### Installation (Newlib)

    cd riscv-gnu-toolchain
    export RISCV=/path/to/riscv/toolchain
    ./configure --prefix=$RISCV
    make

### Installation (Linux)
    
    cd riscv-gnu-toolchain
    export RISCV=/path/to/riscv/toolchain
    ./configure --prefix=$RISCV
    make linux

## Build RISC-V Tools

    ./init.sh
    cd riscv-tools
    ./build.sh

## For verilog generation

    make sram

## For verilator simulation    

### Simulation without VCD

    export RISCV=/path/to/riscv/toolchain
    make sim

### Simulation with VCD

    export RISCV=/path/to/riscv/toolchain
    make sim trace_en=1

    
