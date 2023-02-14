# Releasing

1. Update the `VERSION_NAME` in `gradle.properties` to the release version.

2. Update the `ReleaseNotes.md`:

3. Update the `README.md` so the "Usage" section reflects the new release version and the
   snapshot section reflects the next "SNAPSHOT" version.

4. Commit

   ```
   $ git commit -am "Prepare version X.Y.Z"
   ```

5. Tag

   ```
   $ git tag -am "Version X.Y.Z" X.Y.Z
   ```

6. Update the `VERSION_NAME` in `gradle.properties` to the next "SNAPSHOT" version.

7. Commit

   ```
   $ git commit -am "Prepare next development version"
   ```

8. Push!

   ```
   $ git push && git push --tags
   ```

   This will trigger a GitHub Action workflow which will create a GitHub release and upload the
   release artifacts to Sonatype Nexus.

9. Visit [Sonatype Nexus](https://oss.sonatype.org/) and promote the artifact.

10. Jitpack support github release, so we don't need to do anything and release will be available on jitpack as well.