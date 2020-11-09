SUMMARY = "Snpcast"
DESCRIPTION = "Snapcast is a multiroom client-server audio player"
LICENSE = "GPLv3"

DEPENDS += " \
    avahi \
    boost \
    alsa-lib \
    flac \
    libvorbis \
"

PV = "0.22.0"
S = "${WORKDIR}/git"

SRC_URI = "git://github.com/badaix/snapcast.git;protocol=https;tag=v${PV}"
LIC_FILES_CHKSUM = "file://../git/LICENSE;md5=7702f203b58979ebbc31bfaeb44f219c"

inherit cmake

EXTRA_OECMAKE = "-DBUILD_TESTS=OFF -DBUILD_STATIC_LIBS=OFF"

PACKAGES = " \
    ${PN}-client \
    ${PN}-server \
    ${PN}-dbg \
    ${PN}-client-doc \
    ${PN}-server-doc \
"

FILES_${PN}-client = "${bindir}/snapclient"

FILES_${PN}-client-doc = "${mandir}/man1/snapclient*"

FILES_${PN}-server = " \
    ${bindir}/snapserver \
    ${sysconfdir}/snapserver* \
    ${datadir}/snapserver/* \
"

FILES_${PN}-server-doc = "${mandir}/man1/snapserver*"