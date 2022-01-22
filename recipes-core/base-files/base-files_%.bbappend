FILESEXTRAPATHS_prepend  := "${THISDIR}/${BPN}:"

SRC_URI_prepend_unipi-neuron = " \
        file://sound.conf \
        file://unipi.conf \
"

dirs755 += "${sysconfdir}/modules-load.d"

do_install_append_unipi-neuron () {
        install -m 0644 ${WORKDIR}/sound.conf ${D}${sysconfdir}/modules-load.d/
        install -m 0644 ${WORKDIR}/unipi.conf ${D}${sysconfdir}/modules-load.d/
}