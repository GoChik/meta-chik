SUMMARY = "Chik client"
DESCRIPTION = "Client iot application"
SECTION = "applications"

inherit gobin systemd

SRC_URI = "\
    git://github.com/gochik/client;protocol=https \
    file://client.conf \
    file://chik-client.service \
"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

GOBIN_BUILDFLAGS += "-tags platform_unipi_neuron"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "chik-client.service"

do_install_append() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/client ${D}${bindir}/chik-client
    install -d ${D}${sysconfdir}/chik
    install -m 0644 ${WORKDIR}/client.conf ${D}${sysconfdir}/chik
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/chik-client.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += " \
    ${sysconfdir}/chik/client.conf \
    ${systemd_system_unitdir}/chik-client.service \
"