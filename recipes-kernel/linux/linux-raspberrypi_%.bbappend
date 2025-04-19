FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://unipi.cfg \
    file://0001-drivers-add-unipi-drivers.patch \
"
