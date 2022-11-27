#!/bin/sh
base_dir="$( cd -- "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"
cd $base_dir/riscv-tools && git submodule update --init --recursive .
cd $base_dir/riscv-tools/riscv-tests && git pull origin master && git submodule update --init --recursive .
cd $base_dir/riscv-tools/riscv-pk && git pull origin master && git submodule update --init --recursive .
cd $base_dir/riscv-tools && ./build.sh
