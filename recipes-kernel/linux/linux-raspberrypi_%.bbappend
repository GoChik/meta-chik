FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://defconfig \
    file://devtool-fragment.cfg \
    file://0001-Add-support-for-hifiberry-amps.patch \
    file://0004-Fix-hifiberry-amp2-dt.patch \
    file://0005-hifiberry-amp2-add-mute-gpio.patch \
"

