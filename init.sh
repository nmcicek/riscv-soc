#!/bin/sh
base_dir="$( cd -- "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"
cd $base_dir/rocket-chip && git submodule update --init --recursive .
