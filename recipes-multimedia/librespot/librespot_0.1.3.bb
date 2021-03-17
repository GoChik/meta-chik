# Auto-Generated by cargo-bitbake 0.3.15-alpha.0
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get librespot could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/librespot/0.1.3"
SRC_URI += "git://github.com/librespot-org/librespot.git;protocol=https;nobranch=1"
SRCREV = "45f4276d682da5b2a1db482ae210f6f047eea179"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aes-ctr/0.3.0 \
    crate://crates.io/aes-soft/0.3.3 \
    crate://crates.io/aes/0.3.2 \
    crate://crates.io/aesni/0.6.0 \
    crate://crates.io/alga/0.9.3 \
    crate://crates.io/alsa-sys/0.1.2 \
    crate://crates.io/alsa/0.2.2 \
    crate://crates.io/approx/0.3.2 \
    crate://crates.io/arc-swap/0.4.7 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/0.1.7 \
    crate://crates.io/autocfg/1.0.0 \
    crate://crates.io/base64/0.10.1 \
    crate://crates.io/base64/0.9.3 \
    crate://crates.io/bindgen/0.53.3 \
    crate://crates.io/bit-set/0.5.2 \
    crate://crates.io/bit-vec/0.6.2 \
    crate://crates.io/bitflags/0.7.0 \
    crate://crates.io/bitflags/0.9.1 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/block-buffer/0.7.3 \
    crate://crates.io/block-cipher-trait/0.6.2 \
    crate://crates.io/block-modes/0.3.3 \
    crate://crates.io/block-padding/0.1.5 \
    crate://crates.io/byte-tools/0.3.1 \
    crate://crates.io/byteorder/1.3.4 \
    crate://crates.io/bytes/0.4.12 \
    crate://crates.io/c_linked_list/1.1.1 \
    crate://crates.io/cc/1.0.58 \
    crate://crates.io/cexpr/0.4.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/chrono/0.4.13 \
    crate://crates.io/clang-sys/0.29.3 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/core-foundation-sys/0.5.1 \
    crate://crates.io/coreaudio-rs/0.9.1 \
    crate://crates.io/coreaudio-sys/0.2.5 \
    crate://crates.io/cpal/0.8.2 \
    crate://crates.io/crossbeam-deque/0.7.3 \
    crate://crates.io/crossbeam-epoch/0.8.2 \
    crate://crates.io/crossbeam-queue/0.1.2 \
    crate://crates.io/crossbeam-queue/0.2.3 \
    crate://crates.io/crossbeam-utils/0.6.6 \
    crate://crates.io/crossbeam-utils/0.7.2 \
    crate://crates.io/crypto-mac/0.7.0 \
    crate://crates.io/ctr/0.3.2 \
    crate://crates.io/digest/0.8.1 \
    crate://crates.io/dns-sd/0.1.3 \
    crate://crates.io/env_logger/0.6.2 \
    crate://crates.io/error-chain/0.12.2 \
    crate://crates.io/fake-simd/0.1.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-channel/0.3.5 \
    crate://crates.io/futures-core/0.3.5 \
    crate://crates.io/futures-cpupool/0.1.8 \
    crate://crates.io/futures-executor/0.3.5 \
    crate://crates.io/futures-macro/0.3.5 \
    crate://crates.io/futures-sink/0.3.5 \
    crate://crates.io/futures-task/0.3.5 \
    crate://crates.io/futures-util/0.3.5 \
    crate://crates.io/futures/0.1.29 \
    crate://crates.io/gcc/0.3.55 \
    crate://crates.io/generic-array/0.12.3 \
    crate://crates.io/get_if_addrs-sys/0.1.1 \
    crate://crates.io/get_if_addrs/0.5.3 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.1.14 \
    crate://crates.io/glib-sys/0.9.1 \
    crate://crates.io/glib/0.9.3 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/gobject-sys/0.9.1 \
    crate://crates.io/gstreamer-app-sys/0.8.1 \
    crate://crates.io/gstreamer-app/0.15.6 \
    crate://crates.io/gstreamer-base-sys/0.8.1 \
    crate://crates.io/gstreamer-base/0.15.4 \
    crate://crates.io/gstreamer-sys/0.8.1 \
    crate://crates.io/gstreamer/0.15.7 \
    crate://crates.io/hermit-abi/0.1.15 \
    crate://crates.io/hex/0.3.2 \
    crate://crates.io/hmac/0.7.1 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/httparse/1.3.4 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/hyper-proxy/0.4.1 \
    crate://crates.io/hyper/0.11.27 \
    crate://crates.io/idna/0.1.5 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/itoa/0.4.6 \
    crate://crates.io/jack-sys/0.2.0 \
    crate://crates.io/jack/0.5.7 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/language-tags/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.2.1 \
    crate://crates.io/lewton/0.9.4 \
    crate://crates.io/libc/0.2.73 \
    crate://crates.io/libloading/0.4.3 \
    crate://crates.io/libloading/0.5.2 \
    crate://crates.io/libm/0.2.1 \
    crate://crates.io/libmdns/0.2.6 \
    crate://crates.io/libpulse-sys/0.0.0 \
    crate://crates.io/librespot-tremor/0.1.0 \
    crate://crates.io/linear-map/1.2.0 \
    crate://crates.io/lock_api/0.3.4 \
    crate://crates.io/log/0.3.9 \
    crate://crates.io/log/0.4.11 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/matrixmultiply/0.2.3 \
    crate://crates.io/maybe-uninit/2.0.0 \
    crate://crates.io/memchr/2.3.3 \
    crate://crates.io/memoffset/0.5.5 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mio-named-pipes/0.1.7 \
    crate://crates.io/mio-uds/0.6.8 \
    crate://crates.io/mio/0.6.22 \
    crate://crates.io/miow/0.2.1 \
    crate://crates.io/miow/0.3.5 \
    crate://crates.io/muldiv/0.2.1 \
    crate://crates.io/multimap/0.8.1 \
    crate://crates.io/nalgebra/0.18.1 \
    crate://crates.io/net2/0.2.34 \
    crate://crates.io/nix/0.9.0 \
    crate://crates.io/nom/5.1.2 \
    crate://crates.io/num-bigint/0.2.6 \
    crate://crates.io/num-complex/0.2.4 \
    crate://crates.io/num-integer/0.1.43 \
    crate://crates.io/num-iter/0.1.41 \
    crate://crates.io/num-rational/0.2.4 \
    crate://crates.io/num-traits/0.2.12 \
    crate://crates.io/num/0.1.42 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/ogg-sys/0.0.9 \
    crate://crates.io/ogg/0.7.0 \
    crate://crates.io/once_cell/1.4.0 \
    crate://crates.io/opaque-debug/0.2.3 \
    crate://crates.io/parking_lot/0.9.0 \
    crate://crates.io/parking_lot_core/0.6.2 \
    crate://crates.io/paste-impl/0.1.18 \
    crate://crates.io/paste/0.1.18 \
    crate://crates.io/pbkdf2/0.3.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/1.0.1 \
    crate://crates.io/pin-project-internal/0.4.22 \
    crate://crates.io/pin-project/0.4.22 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.18 \
    crate://crates.io/portaudio-rs/0.3.2 \
    crate://crates.io/portaudio-sys/0.1.1 \
    crate://crates.io/ppv-lite86/0.2.8 \
    crate://crates.io/proc-macro-hack/0.5.16 \
    crate://crates.io/proc-macro-nested/0.1.6 \
    crate://crates.io/proc-macro2/0.4.30 \
    crate://crates.io/proc-macro2/1.0.19 \
    crate://crates.io/protobuf-codegen-pure/2.14.0 \
    crate://crates.io/protobuf-codegen/2.14.0 \
    crate://crates.io/protobuf/2.14.0 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/0.6.13 \
    crate://crates.io/quote/1.0.7 \
    crate://crates.io/rand/0.3.23 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.5.6 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.4 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/rawpointer/0.2.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/regex-syntax/0.6.18 \
    crate://crates.io/regex/1.3.9 \
    crate://crates.io/relay/0.1.1 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rodio/0.9.0 \
    crate://crates.io/rpassword/3.0.2 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/safemem/0.3.3 \
    crate://crates.io/scoped-tls/0.1.2 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/sdl2-sys/0.32.6 \
    crate://crates.io/sdl2/0.32.2 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/serde/1.0.114 \
    crate://crates.io/serde_derive/1.0.114 \
    crate://crates.io/serde_json/1.0.56 \
    crate://crates.io/sha-1/0.8.2 \
    crate://crates.io/sha2/0.8.2 \
    crate://crates.io/shannon/0.2.0 \
    crate://crates.io/shell-words/0.1.0 \
    crate://crates.io/shlex/0.1.1 \
    crate://crates.io/signal-hook-registry/1.2.0 \
    crate://crates.io/slab/0.3.0 \
    crate://crates.io/slab/0.4.2 \
    crate://crates.io/smallvec/0.2.1 \
    crate://crates.io/smallvec/0.6.13 \
    crate://crates.io/socket2/0.3.12 \
    crate://crates.io/stdweb/0.1.3 \
    crate://crates.io/stream-cipher/0.3.2 \
    crate://crates.io/subtle/1.0.0 \
    crate://crates.io/syn/0.15.44 \
    crate://crates.io/syn/1.0.35 \
    crate://crates.io/synstructure/0.10.2 \
    crate://crates.io/take/0.1.0 \
    crate://crates.io/tempfile/3.1.0 \
    crate://crates.io/termcolor/1.1.0 \
    crate://crates.io/time/0.1.43 \
    crate://crates.io/tinyvec/0.3.3 \
    crate://crates.io/tokio-codec/0.1.2 \
    crate://crates.io/tokio-core/0.1.17 \
    crate://crates.io/tokio-current-thread/0.1.7 \
    crate://crates.io/tokio-executor/0.1.10 \
    crate://crates.io/tokio-fs/0.1.7 \
    crate://crates.io/tokio-io/0.1.13 \
    crate://crates.io/tokio-process/0.2.5 \
    crate://crates.io/tokio-proto/0.1.1 \
    crate://crates.io/tokio-reactor/0.1.12 \
    crate://crates.io/tokio-service/0.1.0 \
    crate://crates.io/tokio-signal/0.2.9 \
    crate://crates.io/tokio-sync/0.1.8 \
    crate://crates.io/tokio-tcp/0.1.4 \
    crate://crates.io/tokio-threadpool/0.1.18 \
    crate://crates.io/tokio-timer/0.2.13 \
    crate://crates.io/tokio-udp/0.1.6 \
    crate://crates.io/tokio-uds/0.2.7 \
    crate://crates.io/tokio/0.1.22 \
    crate://crates.io/try-lock/0.1.0 \
    crate://crates.io/typenum/1.12.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.4 \
    crate://crates.io/unicode-normalization/0.1.13 \
    crate://crates.io/unicode-width/0.1.8 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/url/1.7.2 \
    crate://crates.io/uuid/0.7.4 \
    crate://crates.io/vergen/3.1.0 \
    crate://crates.io/version_check/0.9.2 \
    crate://crates.io/void/1.0.2 \
    crate://crates.io/vorbis-sys/0.1.0 \
    crate://crates.io/vorbis/0.0.14 \
    crate://crates.io/vorbisfile-sys/0.0.8 \
    crate://crates.io/want/0.0.4 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/ws2_32-sys/0.2.1 \
    crate://crates.io/zerocopy-derive/0.1.4 \
    crate://crates.io/zerocopy/0.2.8 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=98b2b0c9a6081259c441045ca68b640f \
"

SUMMARY = "An open source client library for Spotify, with support for Spotify Connect"
HOMEPAGE = "https://github.com/librespot-org/librespot"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include librespot-${PV}.inc
include librespot.inc
