FROM ubuntu:18.04
ENV RISCV /tools/rv64gc
RUN apt-get update && \
    apt-get install --no-install-recommends -y git flex default-jdk bison gcc g++ device-tree-compiler wget autoconf automake autotools-dev curl libmpc-dev libmpfr-dev libgmp-dev libusb-1.0-0-dev gawk build-essential bison flex texinfo gperf libtool patchutils bc zlib1g-dev device-tree-compiler pkg-config libexpat-dev python python3 && \
    rm -rf /var/lib/apt/lists/* && \
    touch .dockerignore && echo -e "*/riscv*" > .dockerignore
WORKDIR /tmp/riscv-gnu-toolchain
RUN git clone https://github.com/riscv-collab/riscv-gnu-toolchain /tmp/riscv-gnu-toolchain && \
    mkdir -p /tools && \
    git checkout 2022.11.23 && \
    ./configure --prefix=$RISCV --with-cmodel=medany && \
    make -j10 && \
    make linux -j10 && \
    rm -rf /tmp/riscv-gnu-toolchain
WORKDIR /tmp/riscv-tools
RUN git clone https://github.com/riscv-software-src/riscv-tools /tmp/riscv-tools && \
    git submodule update --init --recursive && \
    sed -i 's/nostartfiles/& -fcommon/' riscv-tests/isa/Makefile && \
    ./build.sh && \
    rm -rf /tmp/riscv-tools
WORKDIR /FROM ubuntu:18.04
ENV RISCV /tools/rv64gc
RUN apt-get update && \
    apt-get install --no-install-recommends -y git flex default-jdk bison gcc g++ device-tree-compiler wget autoconf automake autotools-dev curl libmpc-dev libmpfr-dev libgmp-dev libusb-1.0-0-dev gawk build-essential bison flex texinfo gperf libtool patchutils bc zlib1g-dev device-tree-compiler pkg-config libexpat-dev python python3 && \
    rm -rf /var/lib/apt/lists/* && \
    touch .dockerignore && echo -e "*/riscv*" > .dockerignore
WORKDIR /tmp/riscv-gnu-toolchain
RUN git clone https://github.com/riscv-collab/riscv-gnu-toolchain /tmp/riscv-gnu-toolchain && \
    mkdir -p /tools && \
    git checkout 2022.11.23 && \
    ./configure --prefix=$RISCV --with-cmodel=medany && \
    make -j10 && \
    make linux -j10 && \
    rm -rf /tmp/riscv-gnu-toolchain
WORKDIR /tmp/riscv-tools
RUN git clone https://github.com/riscv-software-src/riscv-tools /tmp/riscv-tools && \
    git submodule update --init --recursive && \
    sed -i 's/nostartfiles/& -fcommon/' riscv-tests/isa/Makefile && \
    ./build.sh && \
    rm -rf /tmp/riscv-tools
WORKDIR /
