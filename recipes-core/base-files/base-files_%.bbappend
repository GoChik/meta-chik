FILESEXTRAPATHS:prepend  := "${THISDIR}/${BPN}:"

SRC_URI:prepend:unipi-neuron = " \
        file://sound.conf \
        file://unipi.conf \
"

dirs755 += "${sysconfdir}/modules-load.d"

do_install:append:unipi-neuron () {
        install -m 0644 ${WORKDIR}/sound.conf ${D}${sysconfdir}/modules-load.d/
        install -m 0644 ${WORKDIR}/unipi.conf ${D}${sysconfdir}/modules-load.d/
}