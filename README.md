# ConnectBot's SSH library
[![Build Status](https://github.com/connectbot/sshlib/actions/workflows/ci.yml/badge.svg)](https://github.com/connectbot/sshlib/actions/workflows/ci.yml)
[![Download](https://img.shields.io/maven-central/v/org.connectbot/sshlib)](https://search.maven.org/artifact/org.connectbot/sshlib)

This is ConnectBot's SSH library. It started as a continuation of the Trilead SSH2 library,
but has had several features added to it since then.

This library retains its original [3-Clause BSD license](
https://opensource.org/licenses/BSD-3-Clause).

##### Encryption:
  * aes256-ctr ([RFC 4344](https://tools.ietf.org/html/rfc4344#section-4))
  * aes128-ctr ([RFC 4344](https://tools.ietf.org/html/rfc4344#section-4))
  * aes256-cbc ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-6.3))
  * aes128-cbc ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-6.3))
  * blowfish-ctr ([RFC 4344](https://tools.ietf.org/html/rfc4344#section-4))
  * blowfish-cbc ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-6.3))
  * 3des-ctr ([RFC 4344](https://tools.ietf.org/html/rfc4344#section-4))
  * 3des-cbc ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-6.3))

##### MACs:
  * hmac-sha2-512-etm@openssh.com ([OpenSSH PROTOCOL](
    https://github.com/openssh/openssh-portable/blob/e1b26ce504662a5d5b991091228984ccfd25f280/PROTOCOL#L54))
  * hmac-sha2-256-etm@openssh.com ([OpenSSH PROTOCOL](
    https://github.com/openssh/openssh-portable/blob/e1b26ce504662a5d5b991091228984ccfd25f280/PROTOCOL#L54))
  * hmac-sha1-etm@openssh.com ([OpenSSH PROTOCOL](
    https://github.com/openssh/openssh-portable/blob/e1b26ce504662a5d5b991091228984ccfd25f280/PROTOCOL#L54))
  * hmac-sha2-512 ([RFC 4868](https://tools.ietf.org/html/rfc4868))
  * hmac-sha2-256 ([RFC 4868](https://tools.ietf.org/html/rfc4868))
  * hmac-sha1 ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-6.4))
  
##### Key support:
  * Ed25519 ([RFC 8709](https://tools.ietf.org/html/rfc8709))
  * ECDSA ([RFC 5656](https://tools.ietf.org/html/rfc5656#section-3))
  * RSA  ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-6.6))

##### Key exchange:
  * ecdh-sha2-nistp521 ([RFC 5656](https://tools.ietf.org/html/rfc5656#section-4))
  * ecdh-sha2-nistp384 ([RFC 5656](https://tools.ietf.org/html/rfc5656#section-4))
  * ecdh-sha2-nistp256 ([RFC 5656](https://tools.ietf.org/html/rfc5656#section-4))
  * curve25519-sha256 ([RFC 8731](https://tools.ietf.org/html/rfc8731))
  * diffie-hellman-group18-sha512 ([RFC 8268](https://tools.ietf.org/html/rfc8268))
  * diffie-hellman-group16-sha512 ([RFC 8268](https://tools.ietf.org/html/rfc8268))
  * diffie-hellman-group14-sha256 ([RFC 8268](https://tools.ietf.org/html/rfc8268))
  * diffie-hellman-group-exchange-sha256 ([RFC 4419](https://tools.ietf.org/html/rfc4419))
  * diffie-hellman-group-exchange-sha1 ([RFC 4419](https://tools.ietf.org/html/rfc4419))
  * diffie-hellman-group14-sha1 ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-8.1))
  * diffie-hellman-group1-sha1 ([RFC 4253](https://tools.ietf.org/html/rfc4253#section-8.1))
