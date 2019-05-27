SUMMARY = "Chik client"
DESCRIPTION = "Client iot application"
LICENSE = "GPLv3"
HOMEPAGE = "https://github.com/gochik/client"
SECTION = "applications"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=650b869bd8ff2aed59c62bad2a22a821"

SRC_URI = "\
    https://github.com/GoChik/client/releases/download/v${PV}/linux-arm;name=binary \
    https://raw.githubusercontent.com/GoChik/client/master/LICENSE;name=license \
    file://client.conf \
    file://chik-client.service \
"

SRC_URI[binary.md5sum] = "49d0d6a6d1b9a1bab1d5caaaff279b73"
SRC_URI[license.md5sum] = "650b869bd8ff2aed59c62bad2a22a821"

inherit systemd

INSANE_SKIP_${PN} = "ldflags already-stripped"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "chik-client.service"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/linux-arm ${D}${bindir}/chik-client
    install -d ${D}${sysconfdir}/chik
    install -m 0644 ${WORKDIR}/client.conf ${D}${sysconfdir}/chik
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/chik-client.service ${D}${systemd_system_unitdir}
}

FILES_${PN} = " \
    ${bindir}/chik-client \
    ${sysconfdir}/chik/client.conf \
    ${systemd_system_unitdir}/chik-client.service \
"