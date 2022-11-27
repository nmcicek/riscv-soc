#!/bin/sh
base_dir="$( cd -- "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"
cd $base_dir && git submodule update --init .
cd $base_dir/riscv-gnu-toolchain && ./configure --prefix=$RISCV 
cd $base_dir/riscv-gnu-toolchain && make -j10
cd $base_dir/riscv-gnu-toolchain && make linux -j10
