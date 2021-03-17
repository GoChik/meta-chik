FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://defconfig \
    file://devtool-fragment.cfg \
    file://0001-Add-support-for-hifiberry-amps.patch \
"

