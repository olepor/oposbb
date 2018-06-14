DESCRIPTION = "The OPOS Kernel"
PR = "r1"
SUMMARY = "Recipe to build the OPOS kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit OPOSvars

# Append OPOS sources to the FILESPATH variable so that the file in SRC_URI will be discovered by bitbake
FILESPATH_append = "${OPOS_SOURCE_DIR}"
SRC_URI = "file://kernel/kernel.c \
           file://kernel/kernel.h \
           file://kernel/kernel.mk \
          "

S = "${WORKDIR}"

do_build() {
echo "I am the first build"
}

do_install() {
echo "I am opos install"
}

do_dompile() {
echo "I am opos compile"
}