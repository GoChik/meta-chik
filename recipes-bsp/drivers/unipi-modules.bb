SUMMARY="UniPi modules"
DESCRIPTION="UniPi kernel modules"
LICENSE="GPL-2.0"

DEPENDS="virtual/kernel"
inherit module

SRC_URI = "git://github.com/UniPiTechnology/unipi-kernel-modules.git;branch=main;protocol=https"
SRCREV="f11e68405080e4387a95bb5f4efb48ef16ed5dcf"

LIC_FILES_CHKSUM="file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

S="${WORKDIR}/git"

do_compile(){
    oe_runmake
}

