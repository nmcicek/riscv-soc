#!/bin/sh
base_dir="$( cd -- "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"
cd $base_dir/riscv-gnu-toolchain
./configure --prefix=$RISCV
make -j10
make linux -j10
