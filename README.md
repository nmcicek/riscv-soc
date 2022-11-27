RISC-V SOC SETUP
=============================

## Clone the repo

    git clone https://github.com/nmcicek/riscv-soc
    ./init_submodules.sh

## Install tools

### Build GNU Toolchain
    
    ./install_toolchain.sh

### Build RISC-V Tools

    ./build_tools.sh

### Alternative Docker Image
    
####    Use the dockerfile in install_tools directory to build a linux image or pull from dockerhub using the following command:
    docker pull nmcicek/riscv_soc

## For verilog generation

    make sram

## For verilator simulation    

### Simulation without VCD

    export RISCV=/path/to/riscv/toolchain
    make sim

### Simulation with VCD

    export RISCV=/path/to/riscv/toolchain
    make sim trace_en=1

    
